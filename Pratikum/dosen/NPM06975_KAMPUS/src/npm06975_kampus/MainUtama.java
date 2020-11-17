import java.util.Scanner;
public class MainUtama {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        controller dosen=new controller();
        int nip,tgllahir,c,d=1,pil;
        char ljt;
        String nama,alamat,tempat,jk;
        do{
        System.out.println("=========== Rapot E-Link ==========");
        System.out.println("Menu :");
        System.out.println("1. Tambah Data");
        System.out.println("2. Cetak Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("===================================");
        System.out.print("Pilihan = ");
        pil=in.nextInt();
        switch(pil){
            case 1 :
                System.out.println("Input Data");
                System.out.print("Nama             : ");
                nama=in.next();
                System.out.print("\nNIP        : ");
                nip=in.nextInt();
                System.out.print("\nAlamat   : ");
                alamat=in.next();
                System.out.print("\nTempat Lahir : ");
                tempat=in.next();
                System.out.print("\nTgl Lahir : ");
                tgllahir=in.nextInt();
                System.out.print("\nJenis Kelamin : ");
                jk=in.next();
                dosen.insert(nama,nip,tgllahir,tempat,alamat,jk);
                System.out.println("==============================");
                break;
            case 2 :
                System.out.println(" Cetak Data ");
                for(Data nilai : dosen.getALL()){
                    System.out.println("Nama             : "+nilai.getNama());
                    System.out.println("NIP        : "+nilai.getNip());
                    System.out.println("Alamat  : "+nilai.getAlamat());
                    System.out.println("TempatLahir  : "+nilai.getTempat());
                    System.out.println("tgl lahir  : "+nilai.getTgllahir());
                    System.out.println("Jenis Kelamin  : "+nilai.getJk());
                    System.out.println("------------------------------");
                }
                System.out.println("==================================");
                break;
                
            case 3 :
                System.out.println("Update Data");
                
                for(Data nilai : dosen.getALL()){
                     System.out.println("Nama             : "+nilai.getNama());
                    System.out.println("NIP        : "+nilai.getNip());
                    System.out.println("Alamat  : "+nilai.getAlamat());
                    System.out.println("TempatLahir  : "+nilai.getTempat());
                    System.out.println("tgl lahir  : "+nilai.getTgllahir());
                    System.out.println("Jenis Kelamin  : "+nilai.getJk());
                    System.out.println("------------------------------");
                }

System.out.println("==================================");
                System.out.println("Masukkan index data yang akan anda update..");
                System.out.print("Index : ");
                c=in.nextInt();
                System.out.println("Input Data");
                System.out.print("Nama             : ");
                nama=in.next();
                System.out.print("\nNIP        : ");
                nip=in.nextInt();
                System.out.print("\nAlamat   : ");
                alamat=in.next();
                System.out.print("\nTempat Lahir : ");
                tempat=in.next();
                System.out.print("\nTgl Lahir : ");
                tgllahir=in.nextInt();
                System.out.print("\nJenis Kelamin : ");
                jk=in.next();
                System.out.println("tekan 1 = lanjut || tekan  0 = batal");
                System.out.println(" (1/0)");
                pil=in.nextInt();
                if(pil==1){
                dosen.update(c,nama,nip,tgllahir,tempat,alamat,jk);}
                else{
                 System.out.println("anda telah membatalkan"); 
                }
                break;     
            case 4 :
                System.out.println(" Delete Data ");           
                for(Data nilai : dosen.getALL()){
                    System.out.println("Nama             : "+nilai.getNama());
                    System.out.println("NIP        : "+nilai.getNip());
                    System.out.println("Alamat  : "+nilai.getAlamat());
                    System.out.println("TempatLahir  : "+nilai.getTempat());
                    System.out.println("tgl lahir  : "+nilai.getTgllahir());
                    System.out.println("Jenis Kelamin  : "+nilai.getJk());  
                }
                System.out.println("\nMasukkan Nama siswa yang ingin di hapus");
                System.out.print("Index : ");
                d=in.nextInt();
                System.out.println("tekan 1 = lanjut || tekan  0 = batal");
                System.out.println(" (1/0)");
                pil=in.nextInt();
                if(pil==1){
                    dosen.delete(d);}
                else{   
                    System.out.println("anda telah membatalkan");
                }
                break;
            }
        System.out.println("Apakah anda ingin keluar program? (Y/N)");
        ljt=in.next().charAt(0);
        }
   while(ljt=='n'||ljt=='N');     
    }
}

