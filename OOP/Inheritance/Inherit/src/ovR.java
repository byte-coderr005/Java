 class ovR {
    private String engineModel;
    void Run()
    {
        System.out.println("Calis");
    }

}

 class bmw extends ovR  {
//Override notiation (notasyon)
//Derleme Zamanı kontrolu : Derleyici metodu gerçekten geçersiz kıldığımızı kontrol eder.
//Eğer hata varsa derleyici hata verir. Bu da olası hataları yakalamamıza yardımcı olur. 
    @Override 
void Run()
{
    System.out.println("Engine Running");
}

}
