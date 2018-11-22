package org.rplsd.autocg.listeners.constraints;

import org.rplsd.autocg.parser.AutoCGBaseListener;
import org.rplsd.autocg.parser.AutoCGParser.Max_hour_defContext;

public class MaxLecturerHourListener extends AutoCGBaseListener {
  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation does nothing.
   * </p>
   */
  @Override
  public void enterMax_hour_def(Max_hour_defContext ctx) {
    System.out.println(ctx.max_hour_value().children.get(0).toString());
  }

  /**
   * {@inheritDoc}
   *
   * <p>
   * The default implementation does nothing.
   * </p>
   */
  @Override
  public void exitMax_hour_def(Max_hour_defContext ctx) {
  }
}