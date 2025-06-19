public class Country { // Gelen resultSet bir nenne listesinin içerisine atılır buradaki gibi. Nedeni de bu nesne listesini
                       // istenildiğinde kullanabilmektir.
    private String code; // getter setter veya constructerdan rahatlıkla yönetebilmek için encapsulation gereği private yapılır.
    private String name;
    private String continent;
    private String region;

    public Country(String code, String name, String continent,String region){
        this.code=code;
        this.name=name;
        this.continent=continent;
        this.region=region;
    }
}
