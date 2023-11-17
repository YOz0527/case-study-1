
// LCD 類別
class LCD {
    int size;

    // 建構子
    LCD(int size) {
        this.size = size;
    }

    // 取得 LCD 成本
    double getCost() {
        if (size == 10) {
            return 2000;
        } else if (size == 15) {
            return 2500;
        } else if (size == 17) {
            return 3000;
        } else {
            return 0; // 若 size 不在 10、15、17 之間，返回 0
        }
    }
}

// CPU 類別
class CPU {
    double speed;

    // 建構子
    CPU(double speed) {
        this.speed = speed;
    }

    // 取得 CPU 成本
    double getCost() {
        if (speed == 1.66) {
            return 6000;
        } else if (speed == 2.2) {
            return 8000;
        } else if (speed == 2.4) {
            return 11000;
        } else {
            return 0; // 若 speed 不在 1.66、2.2、2.4 之間，返回 0
        }
    }
}

// HD 類別
class HD {
    int capacity;

    // 建構子
    HD(int capacity) {
        this.capacity = capacity;
    }

    // 取得 HD 成本
    double getCost() {
        if (capacity == 120) {
            return 2400;
        } else if (capacity == 160) {
            return 2800;
        } else {
            return 0; // 若 capacity 不在 120、160 之間，返回 0
        }
    }
}

// MiniNote 類別
class MiniNote {
    LCD lcd;
    CPU cpu;
    HD hd;

    // 建構子
    MiniNote() {
        lcd = new LCD(10);
        cpu = new CPU(1.66);
        hd = new HD(120);
    }

    // 取得 MiniNote 成本
    double getCost() {
        return 1.4 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }

    // 取得 MiniNote 定價
    double getPrice() {
        return 2 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }
}

// Note15 類別
class Note15 {
    LCD lcd;
    CPU cpu;
    HD hd;

    // 建構子
    Note15() {
        lcd = new LCD(15);
        cpu = new CPU(2.2);
        hd = new HD(160);
    }

    // 取得 Note15 成本
    double getCost() {
        return 1.4 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }

    // 取得 Note15 定價
    double getPrice() {
        return 2 * (lcd.getCost() + cpu.getCost() + hd.getCost());
    }
}

public class J01 {
    public static void main(String[] args) {
        // 創建 MiniNote 和 Note15 物件
        MiniNote miniNote = new MiniNote();
        Note15 note15 = new Note15();

        // 印出 MiniNote 的成本和定價
        System.out.println("MiniNote cost: " + miniNote.getCost() + ", price: " + miniNote.getPrice());

        // 印出 Note15 的成本和定價
        System.out.println("Note15 cost: " + note15.getCost() + ", price: " + note15.getPrice());
    }
}
