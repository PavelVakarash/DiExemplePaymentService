public class BookingTicketsService {
    private PaymentService paymentService;

    public BookingTicketsService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }

    public void doBooking()
    {
        System.out.println("Booking ticket....");
        paymentService.pay();
    }
}
