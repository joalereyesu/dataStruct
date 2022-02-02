
export const Catalog = [
    {
        productName: "Naranja",
        productCode: 43,
        productPrice: 2.39 
    },
    {
        productName: "CocaCola Lata",
        productCode: 31,
        productPrice: 5.00  
    },
    {
        productName: "Pechuga Pollo 10pz",
        productCode: 101,
        productPrice: 34.39  
    },
    {
        productName: "Lays Max Grande",
        productCode: 229,
        productPrice: 4.89  
    },
    {
        productName: "Tortrix Bolsa 10u",
        productCode: 391,
        productPrice: 10.39 
    },
    {
        productName: "Libra Salmon",
        productCode: 479,
        productPrice: 79.26  
    },
    {
        productName: "Botella XL 1L",
        productCode: 143,
        productPrice: 52.87  
    },
    {
        productName: "Queso Crema 340g",
        productCode: 567,
        productPrice: 36.87  
    },
    {
        productName: "DIP Queso Picante 430g",
        productCode: 129,
        productPrice: 44.89  
    },
    {
        productName: "Coca Cola 2L",
        productCode: 167,
        productPrice: 18.00  
    },
    {
        productName: "Aguacate Hass",
        productCode: 89,
        productPrice: 3.76  
    },
    {
        productName: "Mucho Nacho",
        productCode: 190,
        productPrice: 13.95  
    },
    {
        productName: "Helado Pops 1L",
        productCode: 238,
        productPrice: 68.90  
    },
    {
        productName: "Cerveza Corona 6pack",
        productCode: 378,
        productPrice: 51.78  
    },
    {
        productName: "Pizza Congelada 2pack",
        productCode: 185,
        productPrice: 86.25  
    },
    {
        productName: "Pan Frances 20pz",
        productCode: 98,
        productPrice: 75.00  
    },
    {
        productName: "Queso Mozzarella 1L",
        productCode: 156,
        productPrice: 37.50  
    },
    {
        productName: "Jamon de Pavo 1LB",
        productCode: 187,
        productPrice: 38.98  
    },

]

export function getCatalog() {
    console.log("Product Catalog\n-----------------------");
    for (let i in Catalog){
        console.log(i+". "+Catalog[i].productName+"\nProduct code: "+Catalog[i].productCode+"\nPrice: Q"+Catalog[i].productPrice+"\n");
    }
}