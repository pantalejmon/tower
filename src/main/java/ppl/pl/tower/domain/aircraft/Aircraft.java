package ppl.pl.tower.domain.aircraft;


import ppl.pl.tower.domain.code.Code;

/**
 * Do uzupełnienia/Rozszerzenia
 *
 * Stworzyć klasyczny moduł typu CRUD dla przedstawionego poniżej modelu.
 * Moduł powinnien udostępniać RESTowe api oraz umożliwiać komunikację z resztą aplikacji
 * Dane powinny być pobierane z bazy danych wpiętej do aplikacji
 *
 */
public class Aircraft {
    private Long id;
    private Code code;
    private String modelName;
    private String manufacturer;
    private EngineType engineType;
}
