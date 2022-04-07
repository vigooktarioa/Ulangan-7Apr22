        const buah = [ "Durian", "Apel", "Mangga", "Jeruk", "Pepaya"];
        const penjualan = [ 10, 10, 20, 20, 10];
        let max = penjualan[0];
        let temp = 0;
        for (let i = 0; i < penjualan.length; i++) {
            if (penjualan[i] > max) {
                max = penjualan[i];
                temp = i;
            }

        }
        console.log(buah[temp]);

