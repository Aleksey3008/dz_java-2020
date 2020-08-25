// такой тоже имеет место быть ))

public static void main(String[] args) {
        String cleaning[] = new String[3];
        cleaning[0] = "Мама";
        cleaning[1] = "Мыла";
        cleaning[2] = "Раму";

        for (int i = 0; i < cleaning.length; i++) {
            for (int a = 0; a < cleaning.length; a++) {
                for (int b = 0; b < cleaning.length; b++) {
                    if(i!=a & i!=b & a!=b)
                        System.out.println(cleaning[i]+cleaning[a]+cleaning[b]);
                }
            }
        }
    }

}
