Feature: Google search for RDF Group    

	Scenario Outline: Search for RDF Group

		Given I want to use the <BROWSER> browser
		When I do a google search
		And I search for RDF Group
		Then I see text Offering a complete portfolio of IT services

		Examples:
				| BROWSER |
				| chrome |
				| ff |
				| ie |