package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8189);
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            

            Thread responseThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String response = null;
                        try {
                            response = in.readUTF();
                            System.out.println(response);
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            });
            responseThread.start();
            while (true){
                String str = scanner.nextLine();
                out.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
