public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader readTrackFile = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader fis = new BufferedReader(new InputStreamReader(new FileInputStream(readTrackFile.readLine())))) {
            ArrayList sf = new ArrayList<>();
            String line = " ";
            while ((line = fis.readLine()) != 0) {
                int x = Integer.parseInt(line);
                if (x % 2 == 0) {
                    sf.add(x);
                }
            }
            Collections.sort(sf);
            for (Object i : sf) {
                System.out.println(i);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    }
