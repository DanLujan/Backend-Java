package PracticaHarry;

public class Personaje {

    public String nombre, genero, casa, patronus;



    public String getNombre() {  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){ return casa;  }
    public String getPatronus(){  return patronus;  }


    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setPatronnus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "Nombre: "+nombre+"\n"+
                "Genero:"+genero+"\n"+
                "Casa: "+casa+"\n"+
                "Patronus: "+patronus;
    }
}
