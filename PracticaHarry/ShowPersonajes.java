public class ShowPersonajes {
    public static void main(String[] args) {

        Hermione();
        Harry();
        Draco();
        Ron();
        Luna();

    }

    public static void Hermione (){
        Personaje Hermione = new Personaje();
        Hermione.setNombre("Hermione Grainger");
        Hermione.setGenero("Femenino");
        Hermione.setCasa("Gryffindor");
        Hermione.setPatronnus("Nutria");

        String msg = "Nombre:  "+Hermione.getNombre();
        msg +="\n Genero: "+Hermione.getGenero();
        msg +="\n Casa: "+Hermione.getCasa();
        msg +="\n Patronnus: "+Hermione.getPatronus();



        System.out.print(msg);

    }

    public static void Harry(){
        Personaje Harry = new Personaje();
        Harry.setNombre("Harry Potter");
        Harry.setGenero("Masculino");
        Harry.setCasa("Gryffindor");
        Harry.setPatronnus("Ciervo");

        String msg = "\n Nombre:  "+Harry.getNombre();
        msg +="\n Genero: "+Harry.getGenero();
        msg +="\n Casa: "+Harry.getCasa();
        msg +="\n Patronnus: "+Harry.getPatronus();



        System.out.print(msg);

    }

    public static void Ron(){

        Personaje Ron = new Personaje();
        Ron.setNombre("Ron Weasley");
        Ron.setGenero("Masculino");
        Ron.setCasa("Gryffindor");
        Ron.setPatronnus("Terrier");

        String msg = "\n Nombre:  "+Ron.getNombre();
        msg +="\n Genero: "+Ron.getGenero();
        msg +="\n Casa: "+Ron.getCasa();
        msg +="\n Patronnus: "+Ron.getPatronus();



        System.out.print(msg);

    }

    public static void Draco(){
        Personaje Draco = new Personaje();
        Draco.setNombre("Draco Malfoy");
        Draco.setGenero("Masculino");
        Draco.setCasa("Slytherin");
        Draco.setPatronnus("Huron");

        String msg = "\n Nombre:  "+Draco.getNombre();
        msg +="\n Genero: "+Draco.getGenero();
        msg +="\n Casa: "+Draco.getCasa();
        msg +="\n Patronnus: "+Draco.getPatronus();



        System.out.print(msg);

    }

    public static void Luna(){
        Personaje Luna = new Personaje();
        Luna.setNombre("Luna Lovegood");
        Luna.setGenero("Femenino");
        Luna.setCasa("Hufflepuff");
        Luna.setPatronnus("Liebre");

        String msg = "\n Nombre:  "+Luna.getNombre();
        msg +="\n Genero: "+Luna.getGenero();
        msg +="\n Casa: "+Luna.getCasa();
        msg +="\n Patronnus: "+Luna.getPatronus();



        System.out.print(msg);
    }


}
