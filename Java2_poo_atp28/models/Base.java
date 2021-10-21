package Java2_poo_atp28.models;

public class Base {
    public int id;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base id_outro = (Base)obj;
            if(this.id == id_outro.id){
                return true;
            }
        }
        return false;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.id);
    }
}
