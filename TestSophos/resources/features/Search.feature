

Feature: Busqueda  de Sophos solutions en Google


  Scenario: Validaci�n b�squeda en google
    Given El usuario debe abrir un buscador de internet
    When abrir la p�gina de "https://www.google.com/"
    And digitar el valor "Sophos solutions"
    And solicitar la b�squeda
    Then en la vista de los resultados validar la cantidad de resultados que arrojo la consulta
