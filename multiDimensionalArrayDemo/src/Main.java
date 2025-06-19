public class Main {

    public static void main(String[] args) {
        String[][] sehirler=new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Kastamonu";
        sehirler[1][1]="Samsun";
        sehirler[1][2]="Zonguldak";
        sehirler[2][0]="İzmir";
        sehirler[2][1]="Muğla";
        sehirler[2][2]="Manisa";

        for(int i=0;i<3;i++){
            System.out.println(i+1+". Bölge İlleri\n");
            for (int j=0;j<3;j++){
                System.out.println(sehirler[i][j]);
            }System.out.println("-----------------------");
        }
    }
}
// İç içe for döngüsü kurularak çoklu dizi örneği yapıldı.