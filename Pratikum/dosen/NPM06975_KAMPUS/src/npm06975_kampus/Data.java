public class Data {
    String nama,tempat,alamat,jk;
    int nip, tgllahir;

    public String getNama(){
        return nama;
    }
    public int getNip(){
        return nip;
    }
    public String getTempat(){
        return tempat;
    }
     public String getAlamat(){
        return alamat;
    }
     public String getJk(){
        return jk;
    }
      public int getTgllahir(){
        return tgllahir;
    }
     public Data(String nama,int nip,int tgllahir,String alamat,String tempat,String jk){
        this.nama=nama;
        this.nip=nip;
        this.alamat=alamat;
        this.tgllahir=tgllahir;
        this.tempat=tempat;
        this.jk=jk;
    }
}
