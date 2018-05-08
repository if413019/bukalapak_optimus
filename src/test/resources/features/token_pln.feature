Feature: token_pln

	@token_pln
	Scenario: Beli token pln transfer bank
		Given user on home screen taps on buttonShowcase
		And user on home screen taps on tabProfile
		And user on login screen login with credentials nanmaidabu
		And user on home screen taps on buttonShowCaseVP
		And user on home screen taps on buttonShowCaseVP
		And user on vp screen taps on widgetTokenPLN
		And user on vp screen taps on buttonShowcaseBarcode
		And user on vp screen types on textFieldPLN value 536111914018
		And user wait inquiry result
		And user on vp screen taps on dropdownAmount
		And user on vp screen taps on chooseAmount
		And user do checkout from landing page
		And user on checkout screen taps on radioButtonTransfer
		And user do checkout
