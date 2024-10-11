package d18DateTimeStringBuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class AnotherPackageClass {
    public static void main(String[] args) {
        Student veli = new Student(); // d19.. paketi içindeki class tan obje oluşturduk
        System.out.println(veli.stdName); // sadece public olanlara ulaştık herhangi bir kısıtlama publicte yoktur
        System.out.println(veli.toString());// bu veri sızıntısına yol açar dikkat bunla tüm verilere ulaştık toString içinde kullanıldığı için


    }
}
