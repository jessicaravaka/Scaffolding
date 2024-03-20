CREATE DATABASE ProduitScaffold;

\c produitscaffold

CREATE TABLE Categorie (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255)
);

CREATE TABLE Produit (
    id SERIAL PRIMARY KEY,
    nom VARCHAR(255),
    id_Categorie int,
    FOREIGN KEY(id_Categorie) REFERENCES Categorie(id)
);