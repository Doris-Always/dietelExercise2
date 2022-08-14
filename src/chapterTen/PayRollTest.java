package chapterTen;

public class PayRollTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Doris", "Ebele",
                "111-11-1111", 800.00);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kelechi", "Omemgbeoji",
                "222-22-2222", 16.75, 40);
//
//        CommissionEmployee commissionEmployee = new CommissionEmployee("Emmanuel", "Onyenchikotanwanyi",
//                "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("DeFool",
                "ThatNeverAdmits", "444-44-4444", 5000, 0.4, 300);
    }
}
