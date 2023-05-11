public class FakePayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("I am not real payment system");
    }
}
