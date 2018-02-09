public void rotateAnimation(View view) {
	Animator anim = AnimatorInflater
			.loadAnimator(this, R.animator.rotate);
	anim.setTarget(mImage);
	anim.start();
}

public void scaleAnimation(View view) {
	Animator anim = AnimatorInflater
			.loadAnimator(this, R.animator.scale);
	anim.setTarget(mImage);
	anim.start();
}

public void translateAnimation(View view) {
	Animator anim = AnimatorInflater
			.loadAnimator(this, R.animator.translate);
	anim.setTarget(mImage);
	anim.start();
}

public void alphaAnimation(View view) {
	Animator anim = AnimatorInflater
			.loadAnimator(this, R.animator.alpha);
	anim.setTarget(mImage);
	anim.start();
}

public void setAnimation(View view) {
	Animator anim = AnimatorInflater
			.loadAnimator(this, R.animator.set);
	anim.setTarget(mImage);
	anim.start();
}