Scanner scan = new Scanner(System.in);
        System.out.print("Digite numero: ");
        int n = scan.nextInt();
        String texto="";
        
        for (int i = 1; i <= n; i++) {
            texto= "";
            for (int j = 1; j <=i; j++) {
                texto+=i;
            }
            System.out.println(texto);
            
        }
