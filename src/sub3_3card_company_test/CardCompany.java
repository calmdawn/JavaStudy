package sub3_3card_company_test;

public class CardCompany {

    private static CardCompany cardCompany = null;
    private int cardNum = 10001;

    private CardCompany(){

    }

    public static CardCompany getInstance() {
        if(cardCompany == null)
            cardCompany = new CardCompany();
        return cardCompany;
    }

    public Card createCard(){
        Card card = new Card();
        card.setCardNumber(cardNum++);
        return card;
    }

}
