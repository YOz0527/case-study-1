
// CPU 類別
class CPU {
    double speed;

    // 建構子
    CPU(double speed) {
        this.speed = speed;
    }

    // 取得 CPU 成本
    double getCost() {
        return 6000; // 根據題意，CPU 速度為 2.4 的成本是 6000
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
        return 2800; // 根據題意，HD 容量為 160G 的成本是 2800
    }
}

// PC 類別
class PC {
    CPU cpu;
    HD hd;

    // 建構子
    PC() {
        cpu = new CPU(2.4);
        hd = new HD(160);
    }

    // 取得 PC 成本
    double getCost() {
        return cpu.getCost() + hd.getCost() + 500; // 「零件成本」加 500
    }

    // 取得 PC 定價
    double getPrice() {
        return 1.8 * (cpu.getCost() + hd.getCost()); // 「零件成本」的1.8倍
    }
}

// MultiPC 類別
class MultiPC {
    CPU cpu;
    HD hd;

    // 建構子
    MultiPC(int cpuCount, int hdCount) {
        cpu = new CPU(2.4);
        hd = new HD(160);

        // 根據題意，MultiPC 成本為其「零件成本」的1.2倍，售價為其「零件成本」的1.8倍
        // 在建構子中，乘以數量
        for (int i = 1; i < cpuCount; i++) {
            cpu.getCost();
        }
        for (int i = 1; i < hdCount; i++) {
            hd.getCost();
        }
    }

    // 取得 MultiPC 成本
    double getCost() {
        return 1.2 * (cpu.getCost() + hd.getCost()); // 「零件成本」的1.2倍
    }

    // 取得 MultiPC 定價
    double getPrice() {
        return 1.8 * (cpu.getCost() + hd.getCost()); // 「零件成本」的1.8倍
    }
}

public class J02 {
    public static void main(String[] args) {
        // 創建 PC 和 MultiPC 物件
        PC pc = new PC();
        MultiPC multiPC1 = new MultiPC(2, 4);
        MultiPC multiPC2 = new MultiPC(4, 8);

        // 印出 PC 的成本和定價
        System.out.println("PC cost: " + pc.getCost() + ". price: " + pc.getPrice());

        // 印出 MultiPC1 的成本和定價
        System.out.println("MultiPC: 2CPU, 4HD, cost: " + multiPC1.getCost() + ". price: " + multiPC1.getPrice());

        // 印出 MultiPC2 的成本和定價
        System.out.println("MultiPC: 4CPU, 8HD, cost: " + multiPC2.getCost() + ", price: " + multiPC2.getPrice());
    }
}
