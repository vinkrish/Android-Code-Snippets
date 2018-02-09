private ImageView mImageView;

private Animation mRotateAnim;
private Animation mScaleAnim;
private Animation mTranslateAnim;
private Animation mAlphaAnim;

public void scaleAnimation(View view) {
	mScaleAnim = new ScaleAnimation(
			1.0f, 1.5f,
			1.0f, 1.5f,
			Animation.RELATIVE_TO_SELF, 0.5f,
			Animation.RELATIVE_TO_SELF, 0.5f

	);
	mScaleAnim.setDuration(1000);
	mScaleAnim.setAnimationListener(this);
	mImageView.startAnimation(mScaleAnim);
}

public void translateAnimation(View view) {
	 mTranslateAnim = new TranslateAnimation(
			Animation.ABSOLUTE, 0.0f,
			Animation.ABSOLUTE, 150f,
			Animation.ABSOLUTE, 0.0f,
			Animation.ABSOLUTE, 0.0f

	);
	mTranslateAnim.setDuration(1000);
	mTranslateAnim.setAnimationListener(this);
	mImageView.startAnimation(mTranslateAnim);
}

public void alphaAnimation(View view){
	mAlphaAnim = new AlphaAnimation(1.0f, 0.0f);
	mAlphaAnim.setDuration(2000);
	mAlphaAnim.setAnimationListener(this);
	mImageView.startAnimation(mAlphaAnim);
}

public void rotateAnimation(View view) {
	mRotateAnim = new RotateAnimation(
			0.0f, -180f,
			Animation.RELATIVE_TO_SELF, 0.5f,
			Animation.RELATIVE_TO_SELF, 0.5f);
	mRotateAnim.setDuration(1000);
	mRotateAnim.setRepeatMode(Animation.REVERSE);
	mRotateAnim.setRepeatCount(1);
	mRotateAnim.setAnimationListener(this);
	mImageView.startAnimation(mRotateAnim);
}