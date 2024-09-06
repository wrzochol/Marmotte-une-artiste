document.getElementById('searchForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const searchQuery = document.getElementById('searchInput').value;
    if (searchQuery === "") {
        alert("La marmotte n'a rien trouvé, essaye encore !");
    } else {
        // Intégration de l'API Spotify pour la recherche d'artistes
        // Exemple : afficher les résultats d'artistes ici
        document.getElementById('resultats').innerHTML = `Résultats pour "${searchQuery}"`;
    }
});
