package pojos;

public class JsonPlaceRequestBodyPOJO {



    /*
    POJO classlarda, ilk yapilmasi gereken sey butun key degerlerini
    kabul ettikleri data type'i turunde, private ve instance variable
    olarak hazirlamaktir.
     */



    // 1 - Obje icerisindeki tum key degerlerini class level'da private variable olarak hazirla
    private String title;

    private String body;

    private int userId;

    private int id;


    // 2 - Getter - Setter'lari hazirla


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    // 3 - Tum parametreleri iceren Constructor olustur


    public JsonPlaceRequestBodyPOJO(String title, String body, int userId, int id) {
        this.title = title;
        this.body = body;
        this.userId = userId;
        this.id = id;
    }


    // 4 - Parametresiz Constructor olustur


    public JsonPlaceRequestBodyPOJO() {
    }


    // 5 - toString() methodu olustur

    @Override
    public String toString() {
        return "jsonPlaceRequestBodyPOJO{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", userId=" + userId +
                ", id=" + id +
                '}';
    }
}
