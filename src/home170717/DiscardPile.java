package home170717;

class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void push(Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.push(aCard);
	}

	@Override
	public void move(Card aCard, CardPile targetPile) {
		if (targetPile.canTake(this.top())) {
			targetPile.push(pop());
			Solitaire.deselect();
		} else {
			Solitaire.deselect();
		}
	}

	@Override
	public void select(int tx, int ty) {
		if (this.empty()) {
			return;
		}
		Solitaire.select(this.top(), this);
	}
}