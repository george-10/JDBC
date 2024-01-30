1-J'ai commencé par cree une DB sur un serveur. Cette base de données est hébergé par un service nommé Aiven.
2-J'ai importé la librairie Sql de java.
3-Pour etablir une connection, j'ai installé le driver de mySql. De plus j'ai besoin de l'URL, le username et le password qui dont tous donné par Aiven.
4-j'établi la connection avec la base donne avec la methode DriverManager.getConnection().
5-Pour pouvoir executer des commandes je cree un objet statement a partir de l'objet connection cree auparavant.
6-Je sauvegarde ma commande dans un string.
7-Enfin j'utilise executeUpdate() pour executer la requete SQL.
8-Dans le cas de le requete "Select" on utilise l'objet resultSet pour sauvegarder la reponse de la requete et ainsi pour afficher toutes les rangés obtenues.
9-Pour finir je ferme la connexion avec la base de données.
