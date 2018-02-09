public void interpolatorEg(View view) {
	Animation tvAnim = AnimationUtils.loadAnimation(this, R.anim.interpolator_anim);
	mImageView.startAnimation(tvAnim);
}