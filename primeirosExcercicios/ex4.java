Scanner scan = new Scanner(System.in);
        System.out.print("Digite numero: ");
        int n = scan.nextInt();
        
        for (int i = 0; i<= n*10; i+=n) {
            System.out.println(i);
        }
