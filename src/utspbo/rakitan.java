/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspbo;

/**
 *
 * @author hanif
 */
public class rakitan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CPU intel1 = new intel();
        CPU amd1 = new AMD();
        komputer komputer1 = new komputer(intel1);

        komputer1.cetakInfo();
        komputer1.mencabut(intel1);
        komputer1.memasang(amd1);
        komputer1.cetakInfo();
    }
}
