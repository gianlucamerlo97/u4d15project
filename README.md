Catalogo bibliografico con JPA

Ho messo la classe Catalogo come classe astratta poichè libri e riviste hanno gli stessi attributi in comune.
Come inheritance strategy ho scelto table_per_class dato che voglio le tabelle solo per le classi concrete e le queries puntano a riviste o libri in maniera separata
