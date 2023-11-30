package api.object;


public class BookDTO {

    private int number;
    private String title;
    private String author;
    private int price;
    public BookDTO() {}

    public BookDTO(int number,  String title, String author, int price) {
        super();
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//	@Override
//	public String toString() {
//		return "BookDTO [number=" + number + ", title=" + title + ", "
//				+ "author=" + author + ", price=" + price + "]";
//	}

    @Override
    public int hashCode() {

        /* 곱셈 연산을 누적시켜야 하기 때문에 0이 아닌 값으로 초기화 */
        int result = 1;

        /* 필드마다 곱해줄 소수값을 선언
         * 31 소수이기 때문에 연산 시 동일한 hashCode값을 나오지 않을 확률을 증가시킨다.
         * 31이 통상적인 관례이며 String 클래스의 hashCode에서도 사용한 값이다.
         * */
        final int PRIME = 31;

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.number;

        //BookDTO 인스턴스는 모든 값이 같아도 주소값과 해쉬코드가 다르기 때문에
        //equals를 사용할 수 없다. 따라서 같은 값이면 같은 hashCode를 가지는 기본형변수들을 이용하여
        //hashCode를 재정의해준다.

        return result;
    }


    @Override
    public String toString() {
        return "BookDTO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {
        /* 두 인스턴스가 주소가 같으면 이후 다른 내용을 비교할 것 없이 true 반환. */
        if(this == obj) { //동일객체 비교

            return true; //여기서 this.는 book1
        }
        /* this는 인스턴스가 생성되면 주소값이 저장된다. null일 수 없다.
         * 따라서 전달받은 레퍼런스변수에 null값이 저장되어 있다면 비교하려는 두개의
         * 인스턴스는 서로 다른 인스턴스이다.
         * */
        if(obj == null) {
            return false;
        }

        BookDTO other = (BookDTO)obj; //부모는 자식타입에 들어갈수없기때문에 downcasting해줌

        if(this.number != other.number) {
            return false;
        }

        /* title필드가 null인 경우 다른 인스턴스의 title이 null이 아니면 false 반환 */
        if(this.title == null) {

            if(other.title != null) {
                return false;
            }
        } else if(!this.title.equals(other.title)) {

            /* String클래스의 equals()는 이미 해당 기능을 오버라이딩 해 두었기때문에
             * 같은 값을 가지는지 비교를 한다. */
            return false;
        }

        if(this.author == null) {

            if(other.author != null) {

                return false;
            } else if(!this.author.equals(other.author)) {

                return false;
            }
        }

        if(this.price != other.price) {

            return false;
        }

        /* 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true를 반환 */
        return true;
    }







}

