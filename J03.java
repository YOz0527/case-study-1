
// PC 類別
class PC {
    LCD lcd;
    CPU cpu;
    HD hd;

    // 建構子
    PC() {
        lcd = new LCD(17);
        cpu = new CPU(2.4);
        hd = new HD(160);
    }

    // 取得 PC 成本
    double getCost() {
        return 1.4 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }

    // 取得 PC 定價
    double getPrice() {
        return 2 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }
}

// AIIPC 類別
class AIIPC {
    // 比較何者的售價較貴
    static String isExpensive(double price1, double price2) {
        if (price1 > price2) {
            return "Note15 is more expensive than PC";
        } else if (price1 < price2) {
            return "PC is more expensive than Note15";
        } else {
            return "Note15 and PC have the same price";
        }
    }
}

public class J03 {
    public static void main(String[] args) {
        // 創建 Note15 和 PC 物件
        Note15 note15 = new Note15();
        PC pc = new PC();

        // 印出 Note15 的成本和定價
        System.out.println("Note15 cost: " + note15.getCost() + ", price: " + note15.getPrice());

        // 印出 PC 的成本和定價
        System.out.println("PC cost: " + pc.getCost() + ", price: " + pc.getPrice());

        // 使用 AIIPC 類別比較售價
        String result = AIIPC.isExpensive(note15.getPrice(), pc.getPrice());
        System.out.println(result);
    }
}
