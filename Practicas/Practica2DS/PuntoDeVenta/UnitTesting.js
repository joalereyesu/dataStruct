import {Cart} from './Shop.js'

const expectedMyCart = [
    {
        productName: "CocaCola Lata",
        productCode: 31,
        productPrice: 5.00  
    },
    {
        productName: "Lays Max Grande",
        productCode: 229,
        productPrice: 4.89  
    },
    {
        productName: "Botella XL 1L",
        productCode: 143,
        productPrice: 52.87  
    },
    {
        productName: "DIP Queso Picante 430g",
        productCode: 129,
        productPrice: 44.89  
    },
    {
        productName: "Pizza Congelada 2pack",
        productCode: 185,
        productPrice: 86.25  
    }
];

function testCartTotal (){
    let expectedSum = 0;
    for (let i in expectedMyCart) {
        expectedSum = expectedSum + expectedMyCart[i]["productPrice"];    
    }
    if (expectedSum === Cart.getCartTotal) {
        return true;
    }
    else {
        false
    }
}

console.log("Cart Total Test: "+testCartTotal())