import {Catalog, getCatalog} from './modules/Catalog.js';

const Cart = {
    cart: [],
    payments: [],
    addMyProducts: function(index) {
        for (let j in index){
            this.cart.push(Catalog[index[j]]);
        }
    },
    getCartTotal: function() {
        let sum = 0;
        for (let i in this.cart) {
            sum = sum + this.cart[i]["productPrice"];    
        }
        return sum;
    },
    getCartPriceAverage: function(index) {
        return this.cartTotal()/index;
    },
    getPaymentsTotal: function() {
        let = sum =0;
        for (let i in this.payments){
            sum = sum + this.payments[i];
        }
        return sum;
    },
    getBalance: function() {
        return this.cartTotal() - this.paymentsTotal();
    },

    getHighestPrice: function() {
        let max = this.cart[0];
        for (let i in this.cart) {
            if (max < this.cart[i]){
                max = this.cart[i];
            }
        }
        return max;
    },

    getShoppingCart: function() {
        console.log("YOUR SHOPPING CART\n_______________________");
        for (let i in this.cart){
            console.log(i+". "+this.cart[i]["productName"]+"\nProduct code: "+this.cart[i]["productCode"]+"\nPrice: Q."+this.cart[i]["productPrice"]+"\n");
        }
    },

    getReceipt: function() {
        console.log("\nPayment entered: "+this.getPaymentsTotal()+"\n________________\nBalance: "+this.getBalance());
    },

    getPaymentsMade: function() {
        for (let i in this.payments){
            console.log(i+". Q"+this.payment[i]+"\n");
        }
    },

    deletePayment: function(index) {
        let payment2 = [];
        for (let i, j in this.payment) {
            if (i == index) {
                continue;
            }
            payment2[j++] = this.payment[i];
        }
        this.payment = payment2;
        return "The payment has been succesfully deleted!";
    }
}



