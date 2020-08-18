Feature: Contact Us Feature

  @ContactUs
  Scenario: User can navigate from home page to contact us page and view all contact us options
    Given I navigate to the PwC Digital Pulse website
    When I select ‘Contact us’ from the hamburger menu
    Then I am taken to the ‘Contact us’ page
    And I am presented with the below options for contacts

    | PwC Digital Services                 |
    | Digital Pulse editorial team         |
    | Careers at PwC                       |
    | General enquiries                    |

