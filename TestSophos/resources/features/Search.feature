

Feature: Busqueda  de Sophos solutions en Google


  Scenario: Validación búsqueda en google
    Given El usuario debe abrir un buscador de internet
    When abrir la página de "https://www.google.com/"
    And digitar el valor "Sophos solutions"
    And solicitar la búsqueda
    Then en la vista de los resultados validar la cantidad de resultados que arrojo la consulta
