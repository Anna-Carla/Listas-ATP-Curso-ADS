public class atv6artur {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int num=1, dezSoma, centSoma, unSoma,tamNum=0, tipoNum;
        int qntLetras = 0;
        
        //System.out.print("Digite o numero: ");
            //num = sc.nextInt();
            for(int i=1;i<=1000;i++){
                num=i;
                tipoNum=contadorAlgarismo(num, tamNum);

        if (tipoNum==1)  { //unidade
            System.out.println("\nDEVERIA: "+ unidade(num));

            qntLetras += unidade(num);

        } else if (tipoNum==2)  { //dezenas

            if ((num>9)&&(num<20)) {
                qntLetras += dezena(num);

            } else if ((num>19)&&(num<100)) {
                int dezZero, unDezena;

                dezZero = (num/10)*10;
                unDezena = (num%10);

                dezSoma = (dezena(dezZero));
                unSoma = (unidade(unDezena));
                qntLetras += dezSoma;
                qntLetras += unSoma;
            }
            
        } else if (tipoNum==3)  { //centenas
            System.out.println("\nImpressão centenas");

            int centZero, unCent, dezCent;

            centZero = (num/100)*100;
            dezCent = (num%100); dezCent = (dezCent/10)*10;
            unCent = (num%10);

            centSoma = centena(centZero);
            dezSoma = dezena(dezCent);
            unSoma = unidade(unCent);
            qntLetras += dezSoma;
            qntLetras += unSoma;
            qntLetras += centSoma;

        } else { //milhar
            System.out.println("\nImpressão milhar");

            qntLetras+=3;
        
        }
    }
        System.out.println("\nqnt de letras:"+qntLetras);
        //sc.close();
        
    }

    public static int centena(int qualcent) { // ele vai identificar se a centena é 100 - 900;
        int retorno=0;
        if (qualcent == 100) {
            retorno = 3;
        }
        if (qualcent == 200) {
            retorno = 8;
        }
        if (qualcent == 400) {
            retorno = 12;
        }
        if (qualcent == 300) {
            retorno = 9;
        }
        if (qualcent == 500 || qualcent == 600 || qualcent == 700 || qualcent == 800 || qualcent == 900) {
            retorno = 10;
        }
        return retorno;
    }

    public static int dezena(int num) { // ele vai contar os numeros de 1-9;
        int retorno=0;
        if (num/10==1) { //10 a 19
            if (num == 10) {
                retorno = 3;
            }
            if (num == 11 || num == 12) {
                retorno = 4;
            }
            if (num == 13) {
                retorno = 5;
            }
            if (num == 16 || num == 17) {
                retorno = 9;
            }
            if (num == 14 || num == 19) {
                retorno = 8;
            }
            if (num == 15) {
                retorno = 6;
            }
            if (num == 18) {
                retorno = 7;
            }
            return retorno;
        }

        else { //20 a 90

        // vinte 5 - trinta 6 - quarenta 8 - cinquenta 9 - setenta 7 - sessenta 8 - oitenta 7 - noventa 7
        if (num == 20) {
            retorno = 5;
        }
        if (num == 30) {
            retorno = 6;
        }
        if (num == 40 || num == 60) {
            retorno = 8;
        }
        if (num == 50) {
            retorno = 9;
        }
        if (num == 70 || num == 80 || num == 90) {
            retorno = 8;
        }
        return retorno;
        }

    }

    public static int unidade(int num) { // ele vai contar os numeros de 1-9;
        int retorno=0;
        if (num == 1) {
            retorno = 2;
        }
        else if (num == 5) {
            retorno = 5;
        }
        else if ((num == 6) || (num == 7) || (num == 8) || (num == 9) || (num == 2) || (num == 3)) {                                                                                // 4 letras
            retorno = 4;
        }
        else if (num == 4) {
            retorno = 6;
        }
        return retorno;
    }

    public static int contadorAlgarismo(int num, int tamNum)    {
        boolean auxCont=true;
        int auxNum=num;

        while (auxCont)  {
            auxNum = auxNum/10;
            tamNum++;
            if (auxNum==0)  {
                auxCont=false;
            }
        }
        return tamNum;
    }

}