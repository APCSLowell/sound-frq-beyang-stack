import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
  int a = 0;
  for(int i = 0; i < samples.length; i++){
    if(samples[i] > limit)
      samples[i] = limit;
      a++;
    if(samples[i] < limit*-1)
      samples[i] = limit*-1;
      a++;
  }
  return a;
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
  int a = 0;
  int [] b;

  while(samples[a] == 0){
    a++;
  }
  b = new int[samples.length-a];
  for(int i = 0; i < b.length; i++){
    b[i] = samples[i+a];  
  }
  samples = b;
  }
}
