// untuk logicnya kurang lebih data si product binnya tinggal di looping terus find by product code yang sama, terus kalau sama tinggal di tambah sama variable total

let productBin = {
    "requestId": null,
    "data": [
    {
    "id": 100000057465,
    "storageId": 10000008207,
    "code": "A01-01-01-A",
    "productId": 110000081009,
    "productName": "FloBrand-DressBSPink",
    "productCode": "FBR00040101",
    "quantity": 76,
    "createdTime": "2021-12-21T13:54:48Z",
    },
    {
        "id": 100000057466,
        "storageId": 10000002181,
        "code": "A01-01-01-B",
        "productId": 110000081009,
        "productName": "FloBrand-DressBSPink",
        "productCode": "FBR00040101",
        "quantity": 71,
        "createdTime": "2021-12-21T13:54:48Z",
    },
    {
        "id": 100000065224,
        "storageId": 10000008884,
        "code": "Tgt00-A-A-01",
        "productId": 110000081009,
        "productName": "FloBrand-DressBSPink",
        "productCode": "FBR00040101",
        "quantity": 10,
        "createdTime": "2022-02-08T10:35:19Z",
}
],
"message": "success"
}

let totalProductCode = 0;  //total sebelum pengecheck an = 0
const datas = productBin.data; //get array json data untuk di loop
let productCode = "FBR00040101"; //product code yang akan di cari

for (let i = 0; i < datas.length; i++) { 
    let data = datas[i]; //get data per loop nya
    let productCodeData = data.productCode; //ambil product code nya

    if(productCode == productCodeData){ //kalau product code yang di looping sama dengan yang dicari maka akan di tambahkan.
        totalProductCode = totalProductCode + data.quantity;
    }

  }
  console.log("Total Product FBR00040101 is : " + totalProductCode);
