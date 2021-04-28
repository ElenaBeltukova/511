package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Server {
    public static void main(String[] args) {
        HashMap<Socket, String> users = new HashMap<>();
        try {
            ServerSocket serverSocket = new ServerSocket(8188);
            while (true) {
                Socket socket = serverSocket.accept(); //ожидаем клиента
                System.out.println("Клиент подключился");
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                            DataInputStream in = new DataInputStream(socket.getInputStream()) ;
                            out.writeUTF("Добро пожаловать на сервер!");
                            out.writeUTF("Введите ваше имя: ");

                            boolean flag = false;

                            while (!flag) {
                                String nickname = in.readUTF();
                                if (!users.containsValue(nickname)) {
                                    users.put(socket, nickname);
                                    flag = true;
                                } else {
                                    out.writeUTF("Такой никнейм уже есть, попробуйте другой!");
                                }
                            }


                            while (true){
                                System.out.println("Ожидаем сообщение от пользователя");
                                String request = in.readUTF();
                                /*for (Socket user:users) {
                                    DataOutputStream userOut = new DataOutputStream(user.getOutputStream());
                                    userOut.writeUTF(request);
                                }*/
                                for (Map.Entry<Socket, String> user:users.entrySet()){
                                    DataOutputStream userOut = new DataOutputStream(user.getKey().getOutputStream());
                                    if (!user.getKey().equals(socket)) { // не посылать самому себе
                                        userOut.writeUTF(users.get(socket) + ": " + request);
                                    }

                                }
                                //out.writeUTF(request.toUpperCase());
                            }
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }

                    }
                });
                thread.start();
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
