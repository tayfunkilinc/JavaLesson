package d23OopCollections;

public abstract class Honda { // methodlari abstract yapabilmek icin clasida abstract yapmak zorundayiz
    /*
        4- Abstraction(Soyut)
        Abstraction iki bolumden olusur.
        i) Abstract Class: icinde abstruct bir method olmasi o class in abstruct olmasina yeterlimi
        abbstruct class lar hayvanlar alemini olusturdugumuz bir projede
        ***Kendisinden object olusturulmaz. Bazi class'lari obje olusturmak amaciyla degil,
        objeleri gruplara ayirmak ve genel ozellikleri belirlemek icin olustururuz.
        Baslangic degil, sonuctur. Cünkü bu sınıflar belirli bir nesne grubunu temsil eder ve
        bu gruptaki tüm nesneler için ortak olan özellikleri belirler.
        */
    // kendisinden obje olusturulamayan class lar vardir
    //Child lardan hic bir parend methodunu kullanmassa
    // java bunu kullanilmayan diye isaretler gereksiz gorur ve bu methodu soyutlar govdeyi kaldirir
    // budurma abstract yapmak deir bu abstraction olarak adlandirilir
    //Abstraction override yapilmasindan dolayi ortaya cikmistir.

    /*
   1)Abstract method'larin body'si olmaz. Size ne yaptigini soyler,nasil yaptigini soylemez.
   2)Body'si olan method'lara 'non-abstract' veya 'concrete' (somut) method denir
   3)Abstract method'lar tum child class'lar tarafindan override edilmelidir yani kullanilmalidir.
   4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
   5)Abstract class'lar hem 'abstract method' hem de 'concrete method' icerebilirler.
   6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
    */
    //Java’da bir interface veya abstract class içinde main methodu yazmak mümkündür
    //Bir abstract class içinde birden fazla body’siz (gövdesiz) metod, yani abstract metod bulunabilir
    //Abstract Class’lar başka class’lar tarafından extends edilerek kullanılabilir.
    //Java’da bir abstract class, normal (somut) bir class’in child’i olabilir.
    //----------------------


    // neden body siz bir method koyarim bir class icine
    //cevap ------>  bir engine(); abstruct methodunu tum arabalar kullanmak zorunda moorsuz araba olmaz

    // bir seylere kullanmaya zorlamanin yolu bu ornekte oldugu gibi abstruct kullanmaktir

    //---------------------
    //7) Final methodlar override edilemedigi icin, abstract olamazlar.
    // (***“final” bir access modifier değildir. “final,” bir Java anahtar kelimesidir)
    // final class in childi olmaz
    //final methodlar override adilemez  -- bu sebeplede abstruct olamaz cunku kimse kullanamaz
    //final Variable lara yeni deger atanamaz
    //----------------------
    //8) Abstract bir class'in abstract bir child'i olabilir ve abstract child parent'inin methodlarini
    // override etmek zorunda degildir ama isterse de edebilir
    //--------------------
    //9) Abstract bir class private olamaz yoksa child’lari ona ulasip override edemez buda cocugu olamamasina sebep olur
    //-------------------


    public void music(){
        System.out.println("Pro Music System");
    }
   // ornek bun yorumu kaldir bak public void engine();  // hatayi gorduk sebebi body kayip ya body ekle yana bu method abstruc mi diye sorar
    public abstract void engine(); // abstruct methodlar
    // sadece abstruct class lar icinde olur ustte class basina abstract anahtar kelimesini ekleyelim
}
