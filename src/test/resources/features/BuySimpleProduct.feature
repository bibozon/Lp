#bbozonb

Feature: Buy simple products

  As user I want buy simple product at luegopago web site

  Scenario Outline: search and buy simple product

    Given that the user wants to buy a simple product at <website>
    When he searchs and selects a simple product on the site
    Then he sees the product on the cart
    Examples:
      | website                                           |
      | https://qa-njs-front-luegopago-site.luegopago.com |