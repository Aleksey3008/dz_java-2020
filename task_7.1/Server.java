package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {
    static ArrayList<Socket> clients = new ArrayList<Socket>();
    static ArrayList<String>userNames=new ArrayList<>();


    public static void main(String[] args) {
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Сервер запущен");


            while (true){
                socket = serverSocket.accept();
                clients.add(socket);
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                System.out.println("Клиент  подключился");

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            out.writeUTF("Представьтесь:");
                            String userName = in.readUTF();
                            userNames.add(userName);
                            broadcastMsg("Klient " +userName + " с нами ","Сервер");
                            while (true){
                                String str = in.readUTF();
                                userNames.add ( in.readUTF());
                                broadcastMsg(str,userName);
                                System.out.println("Клиент прислал сообщение: "+str);
                                out.writeUTF("Сообщение:"+str+" принято");
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void broadcastMsg(String str,String userName) throws IOException{
        DataOutputStream out;
        for (Socket socket : clients){
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(userName+ ":" +str);
        }
    }
}
