class AA {
    public static void main(String[] args) {
        int n = 13; 
        int sp = 1; 
        int st = n / 2;

        for (int i = 0; i < n; i++) { 
            if (i == 0 || i == n - 1) { 
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= st; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= sp; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= st; j++) {
                    System.out.print("*");
                }
                
                if (i < n / 2) {
                    st--;
                    sp += 2;
                } else {
                    st++;
                    sp -= 2;
                }
                
                System.out.println();
            }
        }
    }
}
