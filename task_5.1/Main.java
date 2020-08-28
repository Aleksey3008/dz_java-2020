public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String family = reader.readLine();
            if(family.isEmpty()) {
                break;
            }
                list.add(family);

        }

        String city = reader.readLine();
        for (int i = 0; i <list.size(); i++) {
           if (list.get(i).equals(city)){
               String family = list.get(i+1);
               System.out.println(family);
               break;
           } else if (i==list.size()-1);
            System.out.println();
        }



        //введи город
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
    }
}
