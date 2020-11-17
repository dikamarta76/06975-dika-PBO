import java.util.ArrayList;
public class controller {
    ArrayList<Data> arraylistdata;
    private int i;
        
    controller(){
        arraylistdata=new ArrayList<Data>();
    }
    void insert(String nama,int nip,int tgllahir,String tempat,String alamat, String jk){
        Data nilai=new Data(nama,nip,tgllahir,tempat,alamat,jk);
        arraylistdata.add(nilai);
    }
    
    void update(int c,String nama,int nip,int tgllahir,String tempat,String alamat, String jk){
        arraylistdata.set(c,new Data(nama,nip,tgllahir,tempat,alamat,jk));
    }
    
    void delete(int d){
        arraylistdata.remove(d);
    }
    
    public ArrayList<Data>getALL(){
        return arraylistdata;
    } 
}

