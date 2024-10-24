db = db.getSiblingDB('my_database');

db.createUser({user: "root", pwd: "example", roles : [{role: "readWrite", db: "my_database"}]});

db.documents.insertMany([
    { name: "Laptop", description: "description 1" },
    { name: "Phone", description: "description 2" },
    { name: "Tablet", description: "description 3" }
]);